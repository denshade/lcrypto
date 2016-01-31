import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by lveeckha on 31/01/2016.
 */
public class PerfectEncryption
{

    public static boolean isPerfectEncryption(Pair<EncryptionFunction, DecryptionFunction> candidate)
    {
        if (! ShannonCipher.isShannonCypher(candidate))return false;
        return true;
    }

    public boolean isCryptCodeSameCardinality(Pair<EncryptionFunction, DecryptionFunction> candidate)
    {
        //candidate.getKey(). CipherTextSpace.
        Map<CipherTextSpaceElement, Set<KeySpaceElement>> map = new HashMap<CipherTextSpaceElement, Set<KeySpaceElement>>();
        CipherTextSpace ciperSpace = null; // new CipherTextSpace();
        MessageSpace messageSpace = null; // new CipherTextSpace();
        KeySpace keySpace = null;
        EncryptionFunction encryptionFunction = candidate.getKey();
        while(messageSpace.hasNext())
        {
            MessageSpaceElement el = messageSpace.next();
            //number of keys that correspond to a cipherelement is exactly N.
            while(keySpace.hasNext()) {
                KeySpaceElement key = keySpace.next();
                CipherTextSpaceElement cipherEl = encryptionFunction.encrypt(key, el);
                if (!map.containsKey(cipherEl)) {
                    map.put(cipherEl, new TreeSet<KeySpaceElement>());
                }
                map.get(cipherEl).add(key);
            }
        }
        Integer current = null;
        for (Map.Entry<CipherTextSpaceElement, Set<KeySpaceElement>> entry : map.entrySet())
        {
            if (current == null)
            {
                current = entry.getValue().size();
            }
            if (entry.getValue().size() !=  current) {
                return false;
            }
        }
        return true;
    }
}

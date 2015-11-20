import javafx.util.Pair;

/**
 * Created by lveeckha on 20/11/2015.
 */
public class ShannonCipher
{
    public static boolean isShannonCypher(Pair<EncryptionFunction, DecryptionFunction> candidate) {
        byte[] original = "this is data".getBytes();
        byte[] encrypted = candidate.getKey().encrypt("key".getBytes(), original);
        byte[] decrypted = candidate.getValue().decrypt("key".getBytes(), encrypted);
        //Not every combination is tested?! Can this truly ever be complete?
        for (int x = 0; x < original.length; x++)
        {
            if (original[x] != decrypted[x])
                return false;
        }
        return true;
    }
}

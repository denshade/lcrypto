import javafx.util.Pair;

/**
 * Created by lveeckha on 20/11/2015.
 */
public class ShannonCipher
{
    public Pair<EncryptionFunction, DecryptionFunction> functions;
    public KeySpace keySpace;
    public MessageSpace messageSpace;
    public CipherTextSpace cipherTextSpace;


    static boolean isShannonCypher(Pair<EncryptionFunction, DecryptionFunction> candidate)
    {
        //Not every combination is tested?! Can this truly ever be complete?
        //we need to be able to prove that programs are each others inverse.
        /*
        byte[] original = "this is data".getBytes();
        byte[] encrypted = candidate.getKey().encrypt("key".getBytes(), original);
        byte[] decrypted = candidate.getValue().decrypt("key".getBytes(), encrypted);
        for (int x = 0; x < original.length; x++)
        {
            if (original[x] != decrypted[x])
                return false;
        }
        */
        return true;
    }

}

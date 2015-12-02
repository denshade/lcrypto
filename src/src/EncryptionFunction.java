/**
 * Created by lveeckha on 20/11/2015.
 */
public abstract class EncryptionFunction
{
    public abstract CipherTextSpaceElement encrypt(KeySpaceElement key, MessageSpaceElement message);
    public abstract Class[] getParameterTypes();

}

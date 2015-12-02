import java.util.function.Function;

/**
 * Created by lveeckha on 20/11/2015.
 */
public abstract class DecryptionFunction {
        public abstract MessageSpaceElement decrypt(KeySpaceElement key, CipherTextSpaceElement message);
        public abstract Class[] getParameterTypes();
}

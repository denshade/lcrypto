import javafx.util.Pair;

import java.util.function.Function;

/**
 * Created by Lieven on 1-12-2015.
 */
public class OneTimePad extends ShannonCipher {
    boolean isOneTimePad(Pair<EncryptionFunction, DecryptionFunction> candidate)
    {
        if (!ShannonCipher.isShannonCypher(candidate)) {
            return false;
        }
        for (Class parameter : candidate.getKey().getParameterTypes())
        {
            //Very limited ways of asking that the parameters are of type
        }
        Function f = new Function() {
            @Override
            public Object apply(Object o) {
                return null;
            }
        }
        return true;
    }
}

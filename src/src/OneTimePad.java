import javafx.util.Pair;

import java.util.BitSet;
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
            if (!parameter.equals(BitSet.class))
            {
                return false;
            }
            //The BitSet must have a specific size.
            //Very limited ways of asking that the parameters are of type
            //It's not because a pair doesn't explicitly agree to the proposed interfaces it is incorrect.
            //A implementer that happens to agree to the interface is easier to agree, others would have to adapt
            //by adjusting wrapping the code into the interface.
        }

        return true;
    }
}

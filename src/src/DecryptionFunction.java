
import javafx.util.Pair;

import java.util.function.Function;

/**
 * Created by lveeckha on 20/11/2015.
 */
public interface DecryptionFunction extends Function<Pair<MessageSpaceElement, KeySpaceElement>, CipherTextSpaceElement>
{

}

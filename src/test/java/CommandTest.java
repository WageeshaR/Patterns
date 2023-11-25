import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import patterns.command.SimpleRemoteController;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private static final Map<Integer, String> outMap = new HashMap<>();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        outMap.put(0, "Turning on living room light\n");
        outMap.put(1, "Turning off living room light\n");
        outMap.put(2, "Turning on kitchen light\n");
        outMap.put(3, "Turning off kitchen light\n");
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
        outMap.clear();
    }

    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3})
    public void buttonTest(int buttonId) {
        SimpleRemoteController remoteController = new SimpleRemoteController();
        remoteController.buttonWasPressed(buttonId);
        assertEquals(outMap.get(buttonId), outContent.toString());
    }
}

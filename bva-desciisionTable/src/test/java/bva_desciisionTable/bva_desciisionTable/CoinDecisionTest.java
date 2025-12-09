package bva_desciisionTable.bva_desciisionTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class CoinDecisionTest {

    @Test
    public void R1() {assertEquals("Positive",
            CoinDecision.CoinDecision("H", "H", "H", "H"));
    }

    @Test
    public void R2() {
        assertEquals("Positive",
                CoinDecision.CoinDecision("H", "H", "H", "T"));
    }

    @Test
    public void R3() { // H,H,T,T → Positive
        assertEquals("Positive",
                CoinDecision.CoinDecision("H", "H", "T", "T"));
    }

    @Test
    public void R4() { // H,T,T,T → Negative
        assertEquals("Negative",
                CoinDecision.CoinDecision("H", "T", "T", "T"));
    }

    @Test
    public void R5() { // T,T,T,T → Negative
        assertEquals("Negative",
                CoinDecision.CoinDecision("T", "T", "T", "T"));
    }
}


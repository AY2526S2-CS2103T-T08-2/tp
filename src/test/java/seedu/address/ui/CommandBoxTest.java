package seedu.address.ui;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CommandBoxTest {

    @Test
    public void getUpdatedCommandText_emptyExisting_replaces() {
        String result = CommandBox.getUpdatedCommandText("", "tag 1 t/veg");
        assertEquals("tag 1 t/veg", result);
    }

    @Test
    public void getUpdatedCommandText_whitespaceExisting_replaces() {
        String result = CommandBox.getUpdatedCommandText("   ", "open");
        assertEquals("open", result);
    }

    @Test
    public void getUpdatedCommandText_fewerThanSevenWords_replaces() {
        String existing = "tag 1 t/vege"; // 3 words
        String result = CommandBox.getUpdatedCommandText(existing, "tag 2 t/meat");
        assertEquals("tag 2 t/meat", result);
    }

    @Test
    public void getUpdatedCommandText_sevenOrMoreWords_appends() {
        String existing = "edit 1 n/John p/123 e/a@b.com a/Somewhere t/tag1 t/tag2";
        String toInsert = " open";
        String result = CommandBox.getUpdatedCommandText(existing, toInsert);
        assertEquals(existing + toInsert, result);
    }
}
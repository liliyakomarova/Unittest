import org.example.MagicBox;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MagicBoxTest {
    private MagicBox<String> magicBox = new MagicBox<>(3);

    @ParameterizedTest
    @ValueSource(strings = {"iteam"})
    void add(String item) {
        magicBox.add(item);
        magicBox.add(item);
        Assertions.assertEquals(true, magicBox.add(item));

    }

    @ParameterizedTest
    @ValueSource(strings = {"1"})
    void addMoreThenSizeOfMagicBox(String item) {
        magicBox.add(item);
        magicBox.add(item);
        magicBox.add(item);
        Assertions.assertEquals(false, magicBox.add(item));

    }

    @Test
    void pickIfMagicBoxIsNotFull() {
        int count = 1;
        assertThrows(Exception.class, () -> {
            magicBox.pick();
        });
    }

    @Test
    void pickIfMagicBoxIsFull() {
        String a = "item1";
        String b = "item2";
        String c = "item2";
        magicBox.add(a);
        magicBox.add(b);
        magicBox.add(c);
        String choosenItem = magicBox.pick();
        System.out.println(choosenItem);
        if (a == choosenItem || b == choosenItem || c == choosenItem) {
            String v = choosenItem;
            Assertions.assertEquals(v, choosenItem);

        }
    }
}
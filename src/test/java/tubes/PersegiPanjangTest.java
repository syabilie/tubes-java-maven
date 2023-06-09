package tubes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersegiPanjangTest {
    @Test
    public void testHitungLuas() {
        double panjang = 5;
        double lebar = 3;

        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
        double luas = persegiPanjang.hitungLuas();
        assertEquals(15.0, luas, 0);
    }
}


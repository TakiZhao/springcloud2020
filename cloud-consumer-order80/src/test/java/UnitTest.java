import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Create by zhaoming at 2020-03-15 16:32
 */
public class UnitTest {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Test
    public void test01() {
        System.out.println(this.atomicInteger.compareAndSet(1, 1));
        System.out.println(this.atomicInteger.get());
    }

}

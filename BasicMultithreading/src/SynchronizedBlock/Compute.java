package SynchronizedBlock;

import static SynchronizedBlock.Count.add;
import static SynchronizedBlock.Count.addAgain;

class Compute {
    static void compute() {
        for(int i=0;i<10;++i) {
            add();
            addAgain();
        }
    }
}

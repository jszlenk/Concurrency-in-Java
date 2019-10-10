# Concurrency in Java

![Algorithms](https://img.shields.io/badge/Concurrent-Programming--in--Java-green.svg?longCache=true&style=for-the-badge)

Parallel programming means using a set of resources to solve some problem in less time by dividing the work. This is the abstract definition and it relies on this part: **solve some problem in less time by dividing the work**. 

The issue with the processor load has a connection with parallel programming in the sense that parallel parallel programming aims to keep all computational elements as busy as possible. But simply keeping the CPU busy does not mean that you are doing parallel programming.

Parallel programming extends well beyond multithreading and can take place among processes running on the same machine or on different machines.

------

#### Multithreading and Parallel Computing in Java:

- Basic Multithreading
  -  **[Callable and Future](https://github.com/jszlenk/Concurrency-in-Java/tree/master/BasicMultithreading/src/CallableAndFuture)**
  -  **[Executors](https://github.com/jszlenk/Concurrency-in-Java/tree/master/BasicMultithreading/src/Executors)**
     -  **[Library](https://github.com/jszlenk/Concurrency-in-Java/tree/master/BasicMultithreading/src/Executors/Library)**
     -  **[Philosopher Problem](https://github.com/jszlenk/Concurrency-in-Java/tree/master/BasicMultithreading/src/Executors/PhilosopherProblem)**
  -  **[Semaphores](https://github.com/jszlenk/Concurrency-in-Java/tree/master/BasicMultithreading/src/Semaphores)**
  -  **[Sequential Processing](https://github.com/jszlenk/Concurrency-in-Java/tree/master/BasicMultithreading/src/SequentialProcessing)**
  -  **[Synchronized](https://github.com/jszlenk/Concurrency-in-Java/tree/master/BasicMultithreading/src/Synchronized)**
  -  **[Synchronized Block](https://github.com/jszlenk/Concurrency-in-Java/tree/master/BasicMultithreading/src/SynchronizedBlock)**
  -  **[Volatile](https://github.com/jszlenk/Concurrency-in-Java/tree/master/BasicMultithreading/src/Volatile)**
  -  **[Wait and notify](https://github.com/jszlenk/Concurrency-in-Java/tree/master/BasicMultithreading/src/WaitAndNotify)**

---

- Concurrent Collections
  -  **[AtomicInteger](https://github.com/jszlenk/Concurrency-in-Java/tree/master/ConcurrentCollections/src/AtomicInteger)**
  -  **[BlockingQueue](https://github.com/jszlenk/Concurrency-in-Java/tree/master/ConcurrentCollections/src/BlockingQueue)**
  -  **[ConcurrentMaps](https://github.com/jszlenk/Concurrency-in-Java/tree/master/ConcurrentCollections/src/ConcurrentMaps)**
  -  **[CyclicBarrier](https://github.com/jszlenk/Concurrency-in-Java/tree/master/ConcurrentCollections/src/CyclicBarrier)**
  -  **[DelayQueue](https://github.com/jszlenk/Concurrency-in-Java/tree/master/ConcurrentCollections/src/DelayQueue)**
  -  **[Exchanger](https://github.com/jszlenk/Concurrency-in-Java/tree/master/ConcurrentCollections/src/Exchanger)**
  -  **[CountDownLatch](https://github.com/jszlenk/Concurrency-in-Java/tree/master/ConcurrentCollections/src/Latch)**
  -  **[PriorityBlockingQueue](https://github.com/jszlenk/Concurrency-in-Java/tree/master/ConcurrentCollections/src/PriorityBlockingQueue)**

---

- Fork/Join Framework
  -  **[RecursiveTask](https://github.com/jszlenk/Concurrency-in-Java/tree/master/ForkJoinFramework/src/RecursiveTask)**
  -  **[RecursiveAction](https://github.com/jszlenk/Concurrency-in-Java/tree/master/ForkJoinFramework/src/RecursiveAction)**
  -  **[ForkJoin Max Find](https://github.com/jszlenk/Concurrency-in-Java/tree/master/ForkJoinFramework/src/ForkJoinMaxFind)**
  -  **[ForkJoin MergeSort](https://github.com/jszlenk/Concurrency-in-Java/tree/master/ForkJoinFramework/src/ForkJoinMergeSort)**
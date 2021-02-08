# The Coffman condition
Necessary conditions for a deadlock to occur:

 - Mutual exclusion: threads may have exclusive access to the shared resources
 - Hold and wait: a thread that may request one resource while holding another resource
 - No preemption: resources cannot forcibly be taken off threes that hold them
 - Circular wait: two or more threads form a circular chain where each thread waits for a resource 
   that the next thread in the chain is holding
   
Avoiding deadlocks requires to **break one or more** of these conditions.
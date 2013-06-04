1. What is the maximum number of words in the input files that your project can handle ?
Assume that the program was started with -Xmx256M and that each word has on average 6 characters.
Answer:
256.000.000  bytes = n1 * n2 * 12 bytes = n^2 *12 bytes.
256.000.000 / 12 = n^2 <=> 21333333 = n^2 <=> n = 4618 words.

2. What would you do to increase this limit ?
I could either increase the memory or decrease the size of the word, since the number of iterations cannot change.

3. Is your program efficient ?
Yes my program is efficient.

4. What would you do to increase its execution performance ?
I could sort the lists in order to reduce the number of iterations.
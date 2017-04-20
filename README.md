# magic-artifact
Time limit 	2 seconds
Memory limit 	256 megabytes

Maxim is playing a video game. It has n levels, numbered from 1 to n. Levels can be completed in any order, it takes Maxim ai seconds to complete the i-th level.

Maxim can find a magic artifact at one of the levels. There is exactly one magic artifact in the game, and once found it will increase the speed of Maxim's hero and reduce the time needed to complete the level. However, it is not known where the artifact is, the probability that it is at the i-th level is pi. The time needed to complete the i-th level after the artifact is found is bi second (bi ≤ ai). Note that artifact doesn't reduce the time needed to complete the level where it is found.

Maxim wants to choose the order he completes the levels, to minimize the expected time to complete the game. Help him to find the minimal possible expected time. Maxim must choose the order to complete the levels before playing the game, the order must not depend on whether the artifact was found or not at some level.

Recall that the expectation of a random variable is the sum over all possible outcomes of a product of the probability of such outcome and the value of the variable. In this problem the outcome corresponds to the level where the artifact is, and the value is the total time needed if the artifact is at that level.
 	

Input data contains several test cases. The first line contains t — the number of test cases (1 ≤ t ≤ 1000).

Each test case is described in the following way: the first line contains integer n — the number of levels (1 ≤ n ≤ 105).

The following n lines describe levels. Each level is specified with three integers ai, bi and xi — the time to complete the level before the artifact was found, the time to complete it after the artifact was found, and the value that helps to find the probability to find the artifact at that level. The probability is calculated using the formula pi = xi / 107 (1 ≤ bi ≤ ai ≤ 105; 0 ≤ xi ≤ 107; the sum of all xi is 107).

The sum of values of n in all test cases of one input data is at most 5·105.
Output format 	

For each test case output one floating point value — the expected time to complete the game if the optimal order was chosen. The answer must have an absolute or relative error of at most 10 - 6.

package org.tendiwa.collections

import java.util.*

fun <T> List<T>.nextAfter(index: Int): T {
    return this[loopedNextIndex(index, size)]
}

fun <T> List<T>.prevBefore(index: Int): T {
    return this[loopedPrevIndex(index, size)]
}

/**
 * Returns a random element from this list. Mutates `random`.
 * @param random Source of randomness.
 */
fun <T> List<T>.randomElement(random: Random): T =
    this[Math.floor(this.size * random.nextDouble()).toInt()]

fun <T> List<T>.goForwardLooped(start: Int, steps: Int): T
    = this[(start + steps) % size]
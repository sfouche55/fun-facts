package com.grasp.funfacts

import java.util.*

class FactBook {
    private val facts = arrayOf(
        "Ants stretch when they wake up in the morning.",
        "Ostriches can run faster than horses.",
        "Olympic gold medals are actually made mostly of silver.",
        "You are born with 300 bones; by the time you are an adult you will have 206.",
        "It takes about 8 minutes for light from the Sun to reach Earth.",
        "Some bamboo plants can grow almost a meter in just one day.",
        "The state of Florida is bigger than England.",
        "Some penguins can leap 2-3 meters out of the water.",
        "On average, it takes 66 days to form a new habit.",
        "Mammoths still walked the earth when the Great Pyramid was being built.",
        "The national animal of Scotland is the unicorn.",
        "Humans are just one of the estimated 8.7 million species on Earth.",
        "You can sneeze faster than a cheetah can run.",
        "In Germany, people help toads cross the road.",
        "The Twitter bird's official name is Larry.",
        "Earth is hit with more energy from the sun each hour than the planet uses in a year.",
        "McDonald’s once made bubblegum-flavoured broccoli.",
        "Scotland has 421 words for snow.",
        "Armadillo shells are bulletproof.",
        "Firefighters use wetting agents to make water wetter.",
        "No number before 1,000 contains the letter A.",
        "Movie trailers originally played after the movie; they trailed the feature film, hence the name.",
        "The Eiffel Tower can grow more than 15cm in summer; the high temperatures make the iron expand.",
        "In the 18th century, pigeon poop was used to make gunpowder.",
        "Domestic cats share more than 95% of their DNA with tigers.",
        "Cats that are fed tuna can become addicted and refuse to eat anything else.",
        "Cats' tails contain about 10% of the bones in their body.",
        "Cats gobble their food; they don't need to chew their food to help with digestion.",
        "Scientists studied cats' brain waves to learn that cats can in fact dream.",
        "Cat nose prints are as unique as human finger prints.",
        "The Japanese consider black cats a sign of good luck.",
        "Dogs and cats can be right-pawed or left-pawed, just like humans are right- or left-handed.",
        "Adult cats rarely \"meow\" to communicate with each other; they've adapted the habit to \"talk\" to humans.",
        "Unlike other mammals, cats can't taste sweetness.",
        "Cats have \"directional hearing\" thanks to their 32 ear muscles; by comparison, humans only have six ear muscles."
    )

    fun getFact(): String {
        val randomGenerator = Random()
        val randomNumber = randomGenerator.nextInt(facts.size)
        return facts[randomNumber]
    }
}
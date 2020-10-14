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
        "The unicorn is the national animal of Scotland.",
        "Humans are just one of the estimated 8.7 million species on Earth.",
        "You can sneeze faster than a cheetah can run.",
        "In Germany, people help toads cross the road.",
        "The Twitter bird's official name Is Larry.",
        "Earth is hit with more energy from the sun each hour than the planet uses in a year.",
        "McDonald’s once made bubblegum-flavoured broccoli.",
        "Scotland has 421 words for snow.",
        "Armadillo shells are bulletproof.",
        "Firefighters use wetting agents to make water wetter.",
        "No number before 1,000 contains the letter A.",
        "Movie trailers originally played after the movie; they trailed the feature film, hence the name.",
        "The Eiffel Tower can grow more than 15cm in summer; the high temperatures make the iron expand.",
        "In the 18th century, pigeon poop was used to make gunpowder."
    )

    fun getFact(): String {
        val randomGenerator = Random()
        val randomNumber = randomGenerator.nextInt(facts.size)
        return facts[randomNumber]
    }
}
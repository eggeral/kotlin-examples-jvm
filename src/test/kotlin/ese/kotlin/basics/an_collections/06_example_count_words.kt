package ese.kotlin.basics.an_collections

import org.junit.Test
import kotlin.test.assertEquals

class _06_example_count_words {

    fun `count the number of words with more than 3 letters`() {

        val words = listOf("This", "eBook", "is", "for", "the", "use", "of", "anyone", "anywhere", "at", "no",
                "cost", "and", "with", "almost", "no", "restrictions", "whatsoever.", "", "You", "may", "copy", "it,",
                "give", "it", "away", "or", "re-use", "it", "under", "the", "terms", "of", "the", "Project",
                "Gutenberg", "License", "included", "with", "this", "eBook", "or", "online", "at", "www.gutenberg.net")

        assertEquals(5, words.filter { w -> w.length > 3 }.count())
    }
}

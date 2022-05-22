import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LittleKtTest{

    @Test
    fun should_ReturnRight_When_Add_Letter_Contains_Small_ab(){
        //Given
        val str ="aabbabab"
        //When
        val count = countSmallLetterA(str)
        //Then
        assertEquals(50.0,count)
    }

    @Test
    fun should_ReturnRightAverage_When_Add_AnySpace(){
        //Given
        val str ="aa bba bab"
        //When
        val count = countSmallLetterA(str)
        //Then
        assertEquals(50.0,count)
    }

    @Test
    fun should_Return_Minus1_When_AddAnyNumber(){
        //Given
        val str ="1aabbabab"
        //When
        val count = countSmallLetterA(str)
        //Then
        assertEquals(-1.0,count)
    }

    @Test
    fun should_Return_Minus1_When_AddAnyMarker(){
        //Given
        val str ="^aabba&b*ab"
        //When
        val count = countSmallLetterA(str)
        //Then
        assertEquals(-1.0,count)
    }

    @Test
    fun should_Return_Minus1_When_AddAnyBigLetters(){
        //Given
        val str ="AabBabab"
        //When
        val count = countSmallLetterA(str)
        //Then
        assertEquals(-1.0,count)
    }


}
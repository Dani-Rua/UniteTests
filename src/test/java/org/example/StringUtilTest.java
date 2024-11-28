package org.example;

import org.example.util.StringUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Estamos definiendo un test sin utilizar librerías
 */
public class StringUtilTest {

    @Test
    public void repeatStringOnce() {
        /**
         * Las dos funcniones que se están probando tienen un refactor.
         * Se esta probando si el parámetro actual es igual al esperado.
         */
        Assert.assertEquals("hola", StringUtil.reapeat("hola", 1));

        /**
         * Esta función no tiene refactor
         * Se esta probando si el parámetro actual es igual al esperado.
         */
       /* String result2 =  StringUtil.reapeat("hola", 1);
        Assert.assertEquals(result2, "hola");*/
    }


    /**
     * Retorna true si el primer argumento se repite la cantidad de veces del segundo argumento.
     * @Params "str" Una cadena de caracteres que será repetido por <code>times</code>.
     * @Params times Un número entero que repetirá a <code>"str"</code>
     * @return true si <code>"str"</code> se repite la cantidad de <code>times</code>.
     */
    @Test
    public void repeatStringMultipleTimes() {
        Assert.assertEquals("holaholahola", StringUtil.reapeat("hola", 3));
    }

    @Test
    public void repeatStringZeroTimes() {
        Assert.assertEquals("", StringUtil.reapeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeatStringNegativeTimes() {
        StringUtil.reapeat("hola", -1);
    }
}
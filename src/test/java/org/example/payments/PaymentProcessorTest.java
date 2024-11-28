package org.example.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

   private PaymentGateway paymentGateway;
   private PaymentProcessor paymentProcessor;

    /**
     * La anotación @Before le dice a Junit que ejecute este método cada vez, antes de cada método de test.
     */
   @Before
    public void setup(){

        /**
         * 1. SE PREPARA EL ESCENARIO, PREPARAMOS LOS OBJETOS QUE QUEREMOS UTILIZAR EN EL TEST.
         */
        /**
         * Se crea un mock de la interface PaymentGateway, esto para simular lo que hace la intarface.
         */
        paymentGateway = Mockito.mock(PaymentGateway.class);

        /**
         * 1. Se crea una instancia de la clase PaymentProcessor que contiene el método makePaymente.
         */
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void paymentIsCorrect(){

        /**
         * 1. Simular que el Geteway fue Ok, cuando al paymentGatway se le haga un request de payment
         * El va a devolver una respuesta correcta.
         */
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        /**
         * 2. SE LLAMA AL MÉTODO QUE QUEREMOS PROBAR "makePaymente" Y 3. SE COMPRUEBA SI EL RESULTADO ESPERADO,
         * EN ESTE CASO ES TRUE.
         */
        /**
         * Se crea la validación que si el pago se realizó, esto lo validamos con anotaciones de mockito.
         */
        assertTrue(paymentProcessor.makePaymente(1000));

    }

    @Test
    public void paymentIsWrong(){
        /**
         * Simular que el Geteway fue ERROR, cuando al paymentGatway se le haga un request de payment
         * El va a devolver una respuesta incorrecta.
         */
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        /**
         * Se crea la validación que si el pago se realizó, esto lo validamos con anotaciones de mockito
         */
        assertFalse(paymentProcessor.makePaymente(1000));

    }

}
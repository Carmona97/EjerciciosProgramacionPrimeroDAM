package ejercicio8;

public class AvisarHaciendaException extends Exception {

    private String titular;
    private String iban;
    private String operacion;

    public AvisarHaciendaException(String titular, String iban, String operacion) {
        this.titular = titular;
        this.iban = iban;
        this.operacion = operacion;
    }

    public String getTitular() {
        return titular;
    }

    public String getIban() {
        return iban;
    }

    public String getOperacion() {
        return operacion;
    }
    
    public String mensajeError(String titular,String iban,boolean operacion) {
    	
    	if(operacion==true) {
    		return titular+" "+iban+" La operacion ha sido un ingreso superior a 3000 euros y se ha avisado a Hacienda";
    	}else {
    		return titular+" "+iban+" La operacion ha sido una retirada, al retirarse una cantidad mayor a 3000 euros se ha avisado a Hacienda";
    	}
    }

}

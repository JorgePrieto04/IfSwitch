public class ifSwitch {
  public static void main(String[] args) {
    int dia = Integer.parseInt(args [0]);
    switch (dia) {
      case 1:
        System.out.println("El " + dia + "º día de la semana es lunes,");
        break;
      case 2:
        System.out.println("El " + dia + "º día de la semana es martes,");
        break;
      case 3:
        System.out.println("El " + dia + "º día de la semana es miércoles,");
        break;
      case 4:
        System.out.println("El " + dia + "º día de la semana es jueves,");
        break;
      case 5:
        System.out.println("El " + dia + "º día de la semana es viernes,");
        break;
      case 6:
        System.out.println("El " + dia + "º día de la semana es sábado,");
        break;
      case 7:
        System.out.println("El " + dia + "º día de la semana es domingo,");
        break;
    }	
    System.out.println("por lo que " + finde(dia));
  }
  private static String finde(int dia) {
		if (dia == 6 || dia == 7) {
			return "ya sería fin de semana.";
		} else {
			return " todavía no sería a fin de semana.";
		}
  }
}

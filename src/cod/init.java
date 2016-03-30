/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod;

import java.io.BufferedReader;
import java.io.FileReader;
import static java.lang.System.exit;
import screen.ventana;

/**
 *
 * @author T11380
 */
public class init {
    
    public static Dades dades = new Dades();
    private static final String _rutaFitxer = "./fitxers/llistaConvidats.txt";
    
    public static void main (String args[]) {
        
        System.out.println("Iniciem aplicació de busqueda de convidats.");
        replenarDades();
        if (dades.getError().getCodError()!=0) {
            System.out.println("Error.");
            System.out.println("\tCodi d'error: "+dades.getError().getCodError());
            System.out.println("\tMissatge d'error: "+dades.getError().getTextError());
            exit(0);
        } else {
            System.out.println("Fitxer analitzat correctament.");
            System.out.println("******************************");
//            System.out.println();
//            System.out.println("Dades:");
//            System.out.println("\t_numConvidats: "+dades.getNumConvidats());
//            System.out.println("\t_numTaules: "+dades.getNumTaules());
//            for (int i=1; i<dades.getTaula().size(); i++) {
//                if (dades.getTaula().get(i).getCapacitatTaula()>0) {
//                    System.out.println();
//                    System.out.println("Taula "+dades.getTaula().get(i).getNumTaula());
//                    System.out.println("Capacitat Taula: "+dades.getTaula().get(i).getCapacitatTaula());
//                    for (int j=0; j<dades.getTaula().get(i).getConvidat().size(); j++) {
//                        System.out.println("\tNom: "+dades.getTaula().get(i).getConvidat().get(j).getNom());
////                        System.out.println("\t\tTe Parella: "+dades.getTaula().get(i).getConvidat().get(j).getTeParella());
//                        if (dades.getTaula().get(i).getConvidat().get(j).getTeParella())
//                            System.out.println("\t\tNom de la Parella: "+dades.getTaula().get(i).getConvidat().get(j).getNomParella());
//                        if (dades.getTaula().get(i).getConvidat().get(j).getEsXiquet())
//                            System.out.println("\t\tEs Xiquet");
////                        System.out.println("\t\tNum de Taula: "+dades.getTaula().get(i).getConvidat().get(j).getNumTaula());
//                        if (!"".equals(dades.getTaula().get(i).getConvidat().get(j).getMissatge()))
//                            System.out.println("\t\tMissatge: "+dades.getTaula().get(i).getConvidat().get(j).getMissatge());
//                    }
//                }
//            }
        }
        
        //Creem la finestra
//        ventana finestra = new ventana();
//        finestra.setVisible(true);
        
    }


    
    public static void replenarDades() {
        
        String linea;
        FileReader f;
        BufferedReader a;
        int err = 99;
        try {
            f = new FileReader(_rutaFitxer);
            a = new BufferedReader(f);
            
            while ((linea = a.readLine())!=null) {
                if (linea.startsWith("#")) {
                    
                } else { 
                    String [] dada = linea.split("_");
                    for (int i=Integer.parseInt(dada[0]);i>=dades.getTaula().size();) {
                        dades.getTaula().add(new Taula());
                    }
                    dades.setNumConvidats(dades.getNumConvidats()+1);
                    dades.setNumTaules(Integer.parseInt(dada[0]));
                    dades.getTaula().get(Integer.parseInt(dada[0])).setNumTaula(Integer.parseInt(dada[0]));
                    dades.getTaula().get(Integer.parseInt(dada[0])).setCapacitatTaula(dades.getTaula().get(Integer.parseInt(dada[0])).getCapacitatTaula()+1);
                    Convidat _convidat = new Convidat();
                    _convidat.setNumTaula(Integer.parseInt(dada[0]));
                    _convidat.setNom(dada[1]);
                    _convidat.setTeParella(Boolean.parseBoolean(dada[2]));
                    if (_convidat.getTeParella()) {
                        _convidat.setNomParella(dada[3]);
                    }
                    _convidat.setEsXiquet(Boolean.parseBoolean(dada[4]));
                    if (dada.length>5)
                        _convidat.setMissatge(dada[5]);
                    dades.getTaula().get(Integer.parseInt(dada[0])).getConvidat().add(dades.getTaula().get(Integer.parseInt(dada[0])).getConvidat().size(), _convidat);
                }
            }
            
        } catch (Exception e) {
            dades.getError().setCodError(err);
            dades.getError().setTextError(e.getMessage());
        }        
    }
}

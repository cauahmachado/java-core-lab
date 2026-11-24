package oop.projectsubscriptionloyaltyclub;
import oop.projectsubscriptionloyaltyclub.visao.TelaClube;

import javax.swing.SwingUtilities;
public class TesteSubscriptionLoyaltClub {
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                TelaClube tela = new TelaClube();
                tela.setVisible(true);
            });
        }
    }



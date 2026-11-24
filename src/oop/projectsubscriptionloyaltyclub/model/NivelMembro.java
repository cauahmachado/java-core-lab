package oop.projectsubscriptionloyaltyclub.model;

    /**
     * Nível do membro. O multiplicador é aplicado nos pontos acumulados.
     */
    public enum NivelMembro {
        COMUM("Comum", 1),
        PREMIUM("Premium", 2);

        private final String descricao;
        private final int multiplicador;

        NivelMembro(String descricao, int multiplicador) {
            this.descricao = descricao;
            this.multiplicador = multiplicador;
        }

        public String getDescricao() {
            return descricao;
        }

        public int getMultiplicador() {
            return multiplicador;
        }

        @Override
        public String toString() {
            return descricao;
        }
    }


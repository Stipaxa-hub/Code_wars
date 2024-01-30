package org.example.DNAToRNAConversion;

public class Bio {
    private static final char SYMBOL_URACIL ='U';
    private static final char SYMBOL_THYMINE = 'T';

    public String dnaToRna(String dna) {
        return dna.replace(SYMBOL_THYMINE, SYMBOL_URACIL);
    }
}

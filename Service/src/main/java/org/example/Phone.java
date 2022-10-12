package org.example;

import lombok.Data;
import lombok.NonNull;

@Data
public class Phone {
    @NonNull
    private String prefix;

    @NonNull
    private String number;

    private String bonusCode;

    public Phone(@NonNull String prefix, @NonNull String number, String bonusCode) {
        this.prefix = prefix;
        this.number = number;
        this.bonusCode = bonusCode;
    }

    public Phone(@NonNull String prefix, @NonNull String number) {
        this.prefix = prefix;
        this.number = number;
    }
}

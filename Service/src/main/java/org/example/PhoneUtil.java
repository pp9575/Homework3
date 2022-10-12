package org.example;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PhoneUtil {
        public String getFullNumber(Phone phone) {
            return phone.getPrefix() + phone.getNumber();
        }

        public String getPhoneWithCode(Phone phone) {
            return phone.getBonusCode() == null ? phone.getPrefix() + phone.getNumber()
                    : phone.getPrefix() + phone.getNumber() + "#" + phone.getBonusCode();
        }
}

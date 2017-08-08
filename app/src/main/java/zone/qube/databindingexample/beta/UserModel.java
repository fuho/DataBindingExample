package zone.qube.databindingexample.beta;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.io.Serializable;

public class UserModel implements Serializable {

    @NonNull private final String firstName;
    @NonNull private final String lastName;
    @Nullable private final String email;

    public UserModel(@NonNull String firstName,
                     @NonNull String lastName,
                     @Nullable String email
    ) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @NonNull
    public String getFirstName() {
        return firstName;
    }

    @NonNull
    public String getLastName() {
        return lastName;
    }

    @Nullable
    public String getEmail() {
        return email;
    }
}

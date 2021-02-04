package rmuti.lapapi.model.tables;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_data")
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private  int userID;

    @Column(name = "user_name")
    private  String userName;

    @Column(name = "pass_word")
    private  String passWord;

    @Column(name = "last_Name")
    private  String lastName;

    @Column(name = "first_Name")
    private  String firstName;
}

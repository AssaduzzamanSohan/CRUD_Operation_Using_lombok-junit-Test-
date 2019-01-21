package Class_9.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private int u_ID;
	@NonNull private String nAME;
	@NonNull private String eMAIL;
	@NonNull private String pHONE;
}

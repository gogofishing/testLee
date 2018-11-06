package testLee;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
	public int getNumUniqueEmails(String[] emails) {
		Set<String> emailNum = new HashSet<String>();
		for (String email : emails) {
			int i = email.indexOf('@');
			String local = email.substring(0, i);
			String domain = email.substring(i);
			if (local.contains("+")) {
				local = local.substring(0, local.indexOf('+'));
			}
			local = local.replaceAll(".", "");
			emailNum.add(local + domain);
		}
		return emailNum.size();
	}
}


public class Vault {

int passwordnum; 
Vault(int num){
	passwordnum = num  ;
}
public boolean tryCode(int code) {
	// TODO Auto-generated method stub
if (passwordnum==code) {
	return true;
}
else {
	return false;
}
	}

}



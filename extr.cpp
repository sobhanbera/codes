
	if(a == b) {
		if(a-x > b-x) {
			int m = min(a-x, n);
			n -= m;
			a -= m;
		}else {
			int m = min(b-y, n);
			n -= m;
			b -= m;
		}
	}
	
	if(a-min(a-x, n) == 1) {
		int m = min(a-x, n);
		a -= min(a-x, n);
		n -= min(a-x, n);
	}else if(b-min(b-y, n) == 1) {
		int m  = min(b-y, n);
		b -= m;
		n -= m;
	}

	if(a < b) {
		int m = min(a-x, n);
		n -= m;
		a -= m;
		if(n >= 1) {
			m = min(b-y, n);
			n -= m;
			b -= m;
		}
	}else {
		int m = min(b-y, n);
		n -= m;
		b -= m;
		if(n >= 1) {
			m = min(a-x, n);
			n -= m;
			a -= m;
		}
	}

	vector<unsigned long long> out;
	for(int j = 0; j < v.size(); ++j) {
		if(n & (1 << j)) {
			out.push_back(v[j]);
		}
	}
	
	sort(out.begin(), out.end());
	
	println(out.size());
	for(auto i : out) {
		printf("%lld ", i);
	}
	printf("\n");

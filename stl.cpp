//```DON'T EVEN TRY TO RUN THIS PROGRAM THIS PROGRAM IS ONLY FOR READ PURPOSE. THANKS.
//MADE BY SOBHAN BERA...
//
//

#include <bits/stdc++.h>
using namespace std;
#define v vi

void printVector(vector<int> vi) {
	for(int i : vi) {
		cout << i << ' ';
	}
	cout << '\n';
}

int main() {

	/*
	 * Vector in C++ STL
	 *		Vectors are same as dynamic arrays with the ability to resize itself automatically when 
	 *		an element is inserted or deleted, with their storage being handled automatically by the 
	 *		container. Vector elements are placed in contiguous storage so that they can be accessed 
	 *		and traversed using iterators. In vectors, data is inserted at the end. Inserting at the 
	 *		end takes differential time, as sometimes there may be a need of extending the array. 
	 *		Removing the last element takes only constant time because no resizing happens. Inserting 
	 *		and erasing at the beginning or in the middle is linear in time.
	 *
	 *		Certain functions associated with the vector are:
	 *		Iterators:-
	 *		begin() – Returns an iterator pointing to the first element in the vector
	 *		end() – Returns an iterator pointing to the theoretical element that 
	 *				follows the last element in the vector
	 *		rbegin() – Returns a reverse iterator pointing to the last element in the vector 
	 *				(reverse beginning). It moves from last to first element
	 *		rend() – Returns a reverse iterator pointing to the theoretical element preceding 
	 *				the first element in the vector (considered as reverse end)
	 *		cbegin() – Returns a constant iterator pointing to the first element in the vector.
	 *		cend() – Returns a constant iterator pointing to the theoretical element 
	 *				that follows the last element in the vector.
	 *		crbegin() – Returns a constant reverse iterator pointing to the last element 
	 *				in the vector (reverse beginning). It moves from last to first element
	 *		crend() – Returns a constant reverse iterator pointing to the theoretical element 
	 *				preceding the first element in the vector (considered as reverse end)
	 */
	vector<int> g1; 
  
    for (int i = 1; i <= 5; i++) 
        g1.push_back(i); 
  
    cout << "Output of begin and end: "; 
    for (auto i = g1.begin(); i != g1.end(); ++i) 
        cout << *i << " "; 
  
    cout << "\nOutput of cbegin and cend: "; 
    for (auto i = g1.cbegin(); i != g1.cend(); ++i) 
        cout << *i << " "; 
  
    cout << "\nOutput of rbegin and rend: "; 
    for (auto ir = g1.rbegin(); ir != g1.rend(); ++ir) 
        cout << *ir << " "; 
  
    cout << "\nOutput of crbegin and crend : "; 
    for (auto ir = g1.crbegin(); ir != g1.crend(); ++ir) 
        cout << *ir << " "; 

	/*
	 * size() – Returns the number of elements in the vector.
	 * max_size() – Returns the maximum number of elements that the vector can hold.
	 * capacity() – Returns the size of the storage space currently allocated to the vector expressed as number of elements.
	 * resize(n) – Resizes the container so that it contains ‘n’ elements.
	 * empty() – Returns whether the container is empty.
	 * shrink_to_fit() – Reduces the capacity of the container to fit its size and destroys all elements beyond the capacity.
	 * reserve() – Requests that the vector capacity be at least enough to contain n elements
	 */
	vector<int> g1; 
  
    for (int i = 1; i <= 5; i++) 
        g1.push_back(i); 
  
    cout << "Size : " << g1.size(); 
    cout << "\nCapacity : " << g1.capacity(); 
    cout << "\nMax_Size : " << g1.max_size(); 
  
    // resizes the vector size to 4 
    g1.resize(4); 
  
    // prints the vector size after resize() 
    cout << "\nSize : " << g1.size(); 
  
    // checks if the vector is empty or not 
    if (g1.empty() == false) 
        cout << "\nVector is not empty"; 
    else
        cout << "\nVector is empty"; 
  
    // Shrinks the vector 
    g1.shrink_to_fit(); 
    cout << "\nVector elements are: "; 
    for (auto it = g1.begin(); it != g1.end(); it++) 
        cout << *it << " "; 

	/*
	 * reference operator [g] – Returns a reference to the element at position ‘g’ in the vector
	 * at(g) – Returns a reference to the element at position ‘g’ in the vector
	 * front() – Returns a reference to the first element in the vector
	 * back() – Returns a reference to the last element in the vector
	 * data() – Returns a direct pointer to the memory array used internally by the vector to store its owned elements.
	 */
	
	vector<int> g1; 
  
    for (int i = 1; i <= 10; i++) 
        g1.push_back(i * 10); 
  
    cout << "\nReference operator [g] : g1[2] = " << g1[2]; 
  
    cout << "\nat : g1.at(4) = " << g1.at(4); 
  
    cout << "\nfront() : g1.front() = " << g1.front(); 
  
    cout << "\nback() : g1.back() = " << g1.back(); 
  
    // pointer to the first element 
    int* pos = g1.data(); 
  
    cout << "\nThe first element is " << *pos; 

	/*
	 * assign() – It assigns new value to the vector elements by replacing old ones
	 * push_back() – It push the elements into a vector from the back
	 * pop_back() – It is used to pop or remove elements from a vector from the back.
	 * insert() – It inserts new elements before the element at the specified position
	 * erase() – It is used to remove elements from a container from the specified position or range.
	 * swap() – It is used to swap the contents of one vector with another vector of same type. Sizes may differ.
	 * clear() – It is used to remove all the elements of the vector container
	 * emplace() – It extends the container by inserting new element at position
	 * emplace_back() – It is used to insert a new element into the vector container, the new element is added to the end of the vector
	 */
	
	// Assign vector 
    vector<int> v;
  
    // fill the array with 10 five times 
    v.assign(5, 10);
  
    cout << "The vector elements are: "; 
    for (int i = 0; i < v.size(); i++) 
        cout << v[i] << " "; 
  
    // inserts 15 to the last position 
    v.push_back(15); 
    int n = v.size(); 
    cout << "\nThe last element is: " << v[n - 1]; 
  
    // removes last element 
    v.pop_back(); 
  
    // prints the vector 
    cout << "\nThe vector elements are: "; 
    for (int i = 0; i < v.size(); i++) 
        cout << v[i] << " "; 
  
    // inserts 5 at the beginning 
    v.insert(v.begin(), 5); 
  
    cout << "\nThe first element is: " << v[0]; 
  
    // removes the first element 
    v.erase(v.begin()); 
  
    cout << "\nThe first element is: " << v[0]; 
  
    // inserts at the beginning 
    v.emplace(v.begin(), 5); 
    cout << "\nThe first element is: " << v[0]; 
  
    // Inserts 20 at the end 
    v.emplace_back(20); 
    n = v.size(); 
    cout << "\nThe last element is: " << v[n - 1]; 
  
    // erases the vector 
    v.clear(); 
    cout << "\nVector size after erase(): " << v.size(); 
  
    // two vector to perform swap 
    vector<int> v1, v2; 
    v1.push_back(1); 
    v1.push_back(2); 
    v2.push_back(3); 
    v2.push_back(4); 
  
    cout << "\n\nVector 1: "; 
    for (int i = 0; i < v1.size(); i++) 
        cout << v1[i] << " "; 
  
    cout << "\nVector 2: "; 
    for (int i = 0; i < v2.size(); i++) 
        cout << v2[i] << " "; 
  
    // Swaps v1 and v2 
    v1.swap(v2); 
  
    cout << "\nAfter Swap \nVector 1: "; 
    for (int i = 0; i < v1.size(); i++) 
        cout << v1[i] << " "; 
  
    cout << "\nVector 2: "; 
    for (int i = 0; i < v2.size(); i++) 
        cout << v2[i] << " "; 

	/*
	 *


	vector<int> vi;
	//adding elements to vector..
	vi.push_back(1);
	vi.push_back(45);
	vi.push_back(9123);
	vi.push_back(12);
	vi.push_back(90);
	vi.push_back(34);
	vi.push_back(12);
	//vi = {1, 45, 9123, 12, 90, 34};
	cout << "After adding elements : ";
	printVector(vi);

	//sorting vector..
	//vi = {1, 12, 12, 34, 45, 90, 9123};
	sort(v.begin(), v.end());
	cout << "After adding elements : ";
	printVector(vi);

	//reverse vector...
	//vi = {9123, 90, 45, 34, 12, 12, 1};
	reverse(v.begin(), v.end());
	cout << "After reversing elements : ";
	printVector(vi);

	//max element of vi is 9123..
	int maxe = *max_element(v.begin(), v.end());
	cout << "Max element in vector is : " << maxe << '\n';
	
	//min element of vi is 1..
	int mine = *min_element(v.begin(), v.end());
	cout << "Min element in vector is : " << mine << '\n';

	//to get sum of element in any range use accumulate function...
	int sum = accumulate(v.begin(), v.end(), 0);
	cout << "Sum of element of vector is : " << sum << '\n';

	//count occurence of any element in vector
	int counts = count(v.begin(), v.end(), 12);
	cout << "Count of 12 is : " << counts << '\n';
	
	//to find any element in vector...
	auto fi = find(v.begin(), v.end(), 90);
	if(fi != v.end())									//its true
		cout << "Element found.\n";
	else
		cout << "Not found!\n";
	
	auto fi2 = find(v.begin(), v.end(), 67);
	if(fi2 != v.end())									//its false this time...
		cout << "Element found.\n";
	else
		cout << "Not found!\n";
	
	//to search an element in vector using binary search...
	auto bs = binary_search(v.begin(), v.end(), 34);
	if(bs != v.end())
		cout << "the index of element is : " << *bs << endl;
	else
		cout << "vector doesn't contains 34.\n";
	
	auto lb = lower_bound(v.begin(), v.end(), 12); //return iterator position to value less than or equals to 12.
	auto ub = upper_bound(v.begin(), v.end(), 34); //return iterator position to value greater than 34.

	//to erase element in vector..
	v.erase(v.begin() + 4);
	//to delete duplicate element in vector use.
	v.erase(unique(v.begin(), v.end()), v.end());

	//to get next and previous permutaion of vector..
	next_permutaion(v.begin(), v.end());
	prev_permutaion(v.begin(), v.end());

	//to get distance of position in vector
	cout << "Distance between 1st to max element is : " << distance(v.begin(), max_element(v.begin(), v.end())) << '\n';
	//to escape duplicate element in vector than find distance...
	cout << "Distance between 1st to unique max element is : " << distance(v.erase(unique(v.begin(), v.end()), v.end())) << '\n';
	
	//the above functions are also applicable for arrays...

	//USEFUL ARRAY OPERATION...
	//...................................................
	/* 
	 * all_of
	 */
		/*This function operates on whole range of array elements and can save time to run a 
		 * loop to check each elements one by one. It checks for a given property on every 
		 * element and returns true when each element in range satisfies specified property, 
		 * else returns false.
		 */
	int ar[6] =  {1, 2, 3, 4, 5, -6}; 
  
    // Checking if all elements are positive 
    all_of(ar, ar+6, [](int x) { return x>0; })? 
          cout << "All are positive elements" : 
          cout << "All are not positive elements";

	/*
	 * any_of
	 */
		/*This function checks for a given range if there’s even one element satisfying a 
		 * given property mentioned in function. Returns true if at least one 
		 * element satisfies the property else returns false.
		 */

	// Checking if any element is negative 
    any_of(ar, ar+6, [](int x){ return x<0; })? 
          cout << "There exists a negative element" : 
          cout << "All are positive elements"; 
	
	/*
	 * none_of
	 */
		/*This function returns true if none of elements satisfies the given 
		 * condition else returns false.
		 */

	// Checking if no element is negative 
    none_of(ar, ar+6, [](int x){ return x<0; })? 
          cout << "No negative elements" : 
          cout << "There are negative elements"; 

	/*
	 * copy_n
	 */
		/*copy_n() copies one array elements to new array. This type of 
		 * copy creates a deep copy of array. This function takes 3
		 *arguments, source array name, size of array and the target array name.
		 */
	int ar1[6]; 
  
    // Using copy_n() to copy contents 
    copy_n(ar, 6, ar1); 
  
    // Displaying the copied array 
    cout << "The new array after copying is : "; 
    for (int i=0; i<6 ; i++) 
       cout << ar1[i] << " ";

	/*
	 * iota()
	 */
		/*This function is used to assign continuous values to array. 
		 * This function accepts 3 arguments, the array name, 
		 * size, and the starting number.
		 */
	// Initializing array with 0 values 
    int ar[6] =  {0}; 
  
    // Using iota() to assign values 
    iota(ar, ar+6, 20); 
  
    // Displaying the new array 
    cout << "The new array after assigning values is : "; 
    for (int i=0; i<6 ; i++) 
       cout << ar[i] << " "; 

	
	//partition of vector...............................
	//..................................................
	/*
	 * 1. partition(beg, end, condition) :- This function is used to partition the elements on basis of condition mentioned in its arguments.
	 * 2. is_partitioned(beg, end, condition) :- This function returns boolean true if container is partitioned else returns false.
	 * 3. stable_partition(beg, end, condition) :- This function is used to partition the elements on basis of condition mentioned in 
	 *		its arguments in such a way that the relative order of the elements is preserved..
	 * 4. partition_point(beg, end, condition) :- This function returns an iterator pointing to the partition point of container i.e. 
	 *		the first element in the partitioned range [beg,end) for which condition is not true. 
	 *		The container should already be partitioned for this function to work.
	 *	5. partition_copy(beg, end, beg1, beg2, condition) :- This function copies the partitioned elements in the differenet 
	 *			containers mentioned in its arguments. It takes 5 arguments. 
	 *			Beginning and ending position of container, beginning position of 
	 *			new container where elements have to be copied (elements returning true for condition), 
	 *			beginning position of new container where other elements have to be copied (elements returning false for condition) 
	 *			and the condition. Resizing new containers is necessary for this function.
	 */
	vector<int> vect = { 2, 1, 5, 6, 8, 7 }; 
      
    // Checking if vector is partitioned  
    // using is_partitioned() 
    is_partitioned(vect.begin(), vect.end(), [](int x) { 
        return x%2==0; 
          
    })? cout << "Vector is partitioned": cout << "Vector is not partitioned"; 
    cout << endl; 
      
    // partitioning vector using partition() 
    partition(vect.begin(), vect.end(), [](int x) { 
        return x%2==0; 
          
    }); 
      
    // Checking if vector is partitioned  
    // using is_partitioned() 
    is_partitioned(vect.begin(), vect.end(), [](int x) 
    { 
        return x%2==0; 
          
    })? cout << "Now, vector is partitioned after partition operation": cout << "Vector is still not partitioned after partition operation"; 
    cout << endl; 
      
    // Displaying partitioned Vector 
    cout << "The partitioned vector is : "; 
    for (int &x : vect) cout << x << " "; 

	stable_partition(vect.begin(), vect.end(), [](int x) 
    { 
        return x%2 == 0;         
    }); 
      
    // Displaying partitioned Vector 
    cout << "The partitioned vector is : "; 
    for (int &x : vect) cout << x << " "; 
    cout << endl; 
      
    // Declaring iterator 
    vector<int>::iterator it1; 
      
    // using partition_point() to get ending position of partition 
    auto it = partition_point(vect.begin(), vect.end(), [](int x) 
    { 
        return x%2==0; 
    }); 
      
    // Displaying partitioned Vector 
    cout << "The vector elements returning true for condition are : "; 
    for ( it1= vect.begin(); it1!=it; it1++) 
    cout << *it1 << " "; 
    cout << endl;


	// Initializing vector 
    vector<int> vect = { 2, 1, 5, 6, 8, 7 }; 
      
    // Declaring vector1 
    vector<int> vect1; 
      
    // Declaring vector1 
    vector<int> vect2; 
      
    // Resizing vectors to suitable size using count_if() and resize() 
    int n = count_if (vect.begin(), vect.end(), [](int x) 
    { 
        return x%2==0; 
          
    } ); 
    vect1.resize(n);  
    vect2.resize(vect.size()-n); 
      
    // Using partition_copy() to copy partitions 
    partition_copy(vect.begin(), vect.end(), vect1.begin(),  
                                     vect2.begin(), [](int x) 
    { 
        return x%2==0; 
    }); 
      
      
    // Displaying partitioned Vector 
    cout << "The elements that return true for condition are : "; 
    for (int &x : vect1)  
            cout << x << " "; 
    cout << endl; 
      
    // Displaying partitioned Vector 
    cout << "The elements that return false for condition are : "; 
    for (int &x : vect2)  
            cout << x << " "; 
    cout << endl;


	//valarray...
	/*
	 * C++98 introduced a special container called valarray to hold and provide mathematical
	 *			 operations on arrays efficiently.
	 *			 It supports element-wise mathematical operations and various forms of generalized 
	 *			 subscript operators, slicing and indirect access.
	 *			 As compare to vectors, valarrays are efficient in certain mathematical operations than vectors also.
	 * 1. apply() :- This function applies the manipulation given in its arguments to all
	 *		 the valarray elements at once and returns a new valarray with manipulated values.
	 * 2. sum() :- This function returns the summation of all the elements of valarrays at once.
	 */

	// Initializing valarray 
    valarray<int> varr = { 10, 2, 20, 1, 30 }; 
      
    // Declaring new valarray 
    valarray<int> varr1 ; 
      
    // Using apply() to increment all elements by 5 
    varr1 = varr.apply([](int x){return x=x+5;}); 
      
    // Displaying new elements value 
    cout << "The new valarray with manipulated values is : "; 
    for (int &x: varr1) cout << x << " "; 
    cout << endl; 
      
    // Displaying sum of both old and new valarray 
    cout << "The sum of old valarray is : "; 
    cout << varr.sum() << endl; 
    cout << "The sum of new valarray is : "; 
    cout << varr1.sum() << endl;

	/*
	 * 3. min() :- This function returns the smallest element of valarray.
	 * 4. max() :- This function returns the largest element of valarray.
	 */

	// Initializing valarray 
    valarray<int> varr = { 10, 2, 20, 1, 30 }; 
      
    // Displaying largest element of valarray 
    cout << "The largest element of valarray is : "; 
    cout << varr.max() << endl; 
      
    // Displaying smallest element of valarray 
    cout << "The smallest element of valarray is : "; 
    cout << varr.min() << endl;


	/*
	 * 5. shift() :- This function returns the new valarray after shifting elements by the 
	 *			number mentioned in its argument. If the number is positive, 
	 *			left-shift is applied, if number is negative, right-shift is applied.
	 * 6. cshift() :- This function returns the new valarray after circularly shifting(rotating) 
	 *			elements by the number mentioned in its argument. If the number is positive, 
	 *			left-circular shift is applied, if number is negative, right-circular shift is applied.
	 */
	
	// Initializing valarray 
    valarray<int> varr = { 10, 2, 20, 1, 30 }; 
      
    // Declaring new valarray 
    valarray<int> varr1; 
      
    // using shift() to shift elements to left 
    // shifts valarray by 2 position 
    varr1 = varr.shift(2); 
      
    // Displaying elements of valarray after shifting 
    cout << "The new valarray after shifting is : "; 
    for ( int&x : varr1) cout << x << " "; 
    cout << endl; 
      
    // using cshift() to circulary shift elements to right 
    // rotates valarray by 3 position 
    varr1 = varr.cshift(-3); 
      
    // Displaying elements of valarray after circular shifting 
    cout << "The new valarray after circular shifting is : "; 
    for ( int&x : varr1) cout << x << " "; 
    cout << endl;

	/*
	 * 7. swap() :- This function swaps one valarray with other.
	 */
	// Initializing 1st valarray 
    valarray<int> varr1 = {1, 2, 3, 4}; 
       
    // Initializing 2nd valarray 
    valarray<int> varr2 = {2, 4, 6, 8}; 
       
     // Displaying valarrays before swapping 
     cout << "The contents of 1st valarray "
             "before swapping are : "; 
     for (int &x : varr1) 
         cout << x << " "; 
     cout << endl; 
     cout << "The contents of 2nd valarray "
             "before swapping are : "; 
     for (int &x : varr2) 
         cout << x << " "; 
     cout << endl; 
    
     // Use of swap() to swap the valarrays 
     varr1.swap(varr2); 
    
     // Displaying valarrays after swapping 
     cout << "The contents of 1st valarray "
             "after swapping are : "; 
     for (int &x : varr1) 
         cout << x << " "; 
     cout << endl; 
    
     cout << "The contents of 2nd valarray "
             "after swapping are : "; 
     for (int &x : varr2) 
         cout << x << " "; 
     cout << endl;
}



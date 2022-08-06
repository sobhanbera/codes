 #include<iostream>
using namespace std;
struct Node{
    int data;
    struct Node*left;
    struct Node*right;

    Node(int val){
        data=val;
        left=NULL;
        right=NULL;
    }
};
Node*InOrder(Node*root){
    Node*curr=root;
    while(curr && curr->left!=NULL){
        curr=curr->left;
    }
    return root;
}

Node*insert(Node*root, int val){
    if(root==NULL){
        return new Node(val);
    }
    if(val<root->data){
        insert(root->left, val);
    }else{
        insert(root->right, val);
    }
    return root;
}
Node*Delete(Node*root, int key){
    if(key<root->data){
       root->left=Delete(root->left, key);
    }else if(key>root->data){
        root->right=Delete(root->right, key);
    }
    else{
        if(root->left==NULL){
             Node*temp=root->right;
             free(root);
             return temp;
        }else if(root->right==NULL){
            Node*temp=root->left;
            free(root);
            return temp;
        }
    }
    Node*temp=InOrder(root->right);
    root->data=temp->data;
    root->right=Delete(root->right, temp->data);
}
void preorder(Node*root){
    if(root==NULL){
        return;
    }
    cout<<root->data<<" ";
    preorder(root->left);
    preorder(root->right);
}
void inorder(Node*root){
      if(root==NULL){
        return;
    }
    inorder(root->left);
    cout<<root->data<<" ";
    inorder(root->right);
}
void postorder(Node*root){
     if(root==NULL){
        return;
    }
    postorder(root->left);
    postorder(root->right);
    cout<<root->data<<" ";
}
int main(){
    int val,choice;
    Node*root;
    cout<<"**OPERATIONS ON TREES**\n";
    cout<<"1.Insert\n";
    cout<<"2.Delete\n";
    cout<<"3.Display in Preorder\n";
    cout<<"4.Display in Inorder\n";
    cout<<"5.Display in Postorder\n";
    cout<<"6.Exit\n";
    while(choice!=6){
        cout<<"Enter Your Choice\n";
        cin>>choice;
        switch(choice){
            case 1:
                 cout<<"Enter a number to be inserted in a tree\n";
                 cin>>val;
                 insert(root, val);
                 cout<<"Element in the Tree are\n";
                 inorder(root);
                 break;
            case 2:
                 cout<<"Enter a number from the Tree you want to delete\n";
                 cin>>val;
                 Delete(root, val);
                 cout<<"Element in the Tree are\n";
                 inorder(root);
                 break;
            case 3:
                 cout<<"The Tree in Preorder Form will be\n";
                 preorder(root);
                 break;
            case 4:
                 cout<<"The Tree in Preorder Form will be\n";
                 inorder(root);
                 break;
            case 5:
                cout<<"The Tree in Preorder Form will be\n";
                 postorder(root);
                 break;
        }
    }
    return 0;
}


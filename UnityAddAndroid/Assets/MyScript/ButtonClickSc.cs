using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ButtonClickSc : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    public void onClick() {
        Debug.Log("onClick  now");
        var javaObj = new AndroidJavaClass("com.example.customlib.CommunicationUtil");
        javaObj.CallStatic("goToNextActivity","Ç°ÍùÏÂÒ»Ò³");
       
    }
}

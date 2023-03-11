using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class ReceiveAndroidMsg : MonoBehaviour
{
    // Start is called before the first frame update
    public GameObject obj;

    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
    }


    public void setTitle(string title) {
        Text t = obj.GetComponent<Text>();
        t.text = title;
    }
}

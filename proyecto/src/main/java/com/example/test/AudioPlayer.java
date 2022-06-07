package com.example.test;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.server.AbstractStreamResource;

@Tag("audio")
public class AudioPlayer  extends Component {

    public AudioPlayer(){
        getElement().setAttribute("controls",true);
    }

    public  void setSource(String path){
        getElement().setProperty("src",path);
    }

    public void setSource(final AbstractStreamResource resource) {
        getElement().setAttribute("src", resource);
    }
}

import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

@customElement('vista-ver_detalle_cancion')
export class VistaVer_detalle_cancion extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="margin-top: 8%;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1">
   <img id="img" style="width: 300px;" src="https://www.intelcoms.net/wp-content/uploads/2018/08/cancion.png">
   <vaadin-button id="vaadinButton" style="align-self: center;">
    Reproductor
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="align-self: center;">
   <h4 id="h41">Nombre canción</h4>
   <h4 id="h4">Nombre artista</h4>
   <h4 id="h42">Nombre álbum</h4>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
    <vaadin-button id="vaadinButton1">
     Corazon
    </vaadin-button>
    <vaadin-select value="Item one" id="vaadinSelect">
     <template>
      <vaadin-list-box>
       <vaadin-item>
         Item one 
       </vaadin-item>
       <vaadin-item>
         Item two 
       </vaadin-item>
       <vaadin-item>
         Item three 
       </vaadin-item>
      </vaadin-list-box>
     </template>
    </vaadin-select>
    <vaadin-button id="vaadinButton2">
     Ver creditos
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

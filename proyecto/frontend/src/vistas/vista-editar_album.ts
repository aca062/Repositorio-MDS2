import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

@customElement('vista-editar_album')
export class VistaEditar_album extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <h2 id="h2" style="margin-left: 10%;">Editar album</h2>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4" style="width: 100%; height: 20%; justify-content: flex-start; align-self: center;">
  <img id="img" style="margin-left: 10%;" src="https://cdn-icons-png.flaticon.com/512/26/26805.png">
  <vaadin-button id="vaadinButton" style="flex-grow: 0; align-self: center; margin-left: 10%;">
   Cambiar imagen
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout3" style="height: 10%; width: 100%; justify-content: flex-start;">
  <vaadin-text-field label="Titulo" id="titulo" style="width: 80%; margin-left: 10%; align-self: center;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="height: 10%; width: 100%; justify-content: flex-start;" id="vaadinHorizontalLayout2">
  <vaadin-text-field label="Nombre artista " style="width: 80%; margin-left: 10%; align-self: center;" id="nombreArtista"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="height: 10%; width: 100%; justify-content: flex-start;" id="vaadinHorizontalLayout1">
  <vaadin-text-field label="Fecha edición" style="width: 80%; margin-left: 10%; align-self: center;" id="fechaEdición"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="height: 10%; width: 100%; justify-content: flex-start; flex-direction: row;" id="vaadinHorizontalLayout">
  <vaadin-select value="Item one" id="vaadinSelect" style="width: 80%; margin-left: 10%;">
   <template>
    <vaadin-list-box id="vaadinListBox1" selected="0">
     <vaadin-item selected>
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
 </vaadin-horizontal-layout>
 <vaadin-list-box id="vaadinListBox" style="width: 80%; margin-left: 10%;">
  <vaadin-item id="vaadinItem2">
    Item one 
  </vaadin-item>
  <vaadin-item id="vaadinItem1">
    Item two 
  </vaadin-item>
  <vaadin-item id="vaadinItem">
    Item three 
  </vaadin-item>
 </vaadin-list-box>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

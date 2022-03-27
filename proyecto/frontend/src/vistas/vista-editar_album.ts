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
 <vaadin-vertical-layout theme="spacing" style="width: 100%; margin-left: var(--lumo-space-xl);background-color: var(--lumo-contrast-10pct);" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4" style="width: 100%; height: 20%; justify-content: flex-start; align-self: center;">
   <img id="img" src="https://i.scdn.co/image/ab67616d0000b273005ee342f4eef2cc6e8436ab">
   <vaadin-button id="vaadinButton" style="flex-grow: 0; align-self: center;">
     Cambiar imagen 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-text-field label="Nombre artista " style="width: 80%; align-self: flex-start;" id="nombreArtista" value="Bad bunny"></vaadin-text-field>
  <vaadin-text-field label="Fecha edición" style="width: 80%; align-self: flex-start;" id="fechaEdición" value="27/11/2020"></vaadin-text-field>
  <vaadin-text-field label="Titulo" id="titulo" style="width: 80%; align-self: flex-start;" value="El último tour del mundo"></vaadin-text-field>
  <vaadin-select value="Item one" id="vaadinSelect" style="width: 80%;">
   <template>
    <vaadin-list-box id="vaadinListBox1" selected="0">
     <vaadin-item selected id="vaadinItem3">
       ListaCanciones 
     </vaadin-item>
     <vaadin-item id="vaadinItem4">
       Item two 
     </vaadin-item>
     <vaadin-item id="vaadinItem5">
       Item three 
     </vaadin-item>
    </vaadin-list-box>
   </template>
  </vaadin-select>
  <vaadin-list-box id="vaadinListBox" style="width: 80%;">
   <vaadin-item id="vaadinItem2">
     120 
   </vaadin-item>
   <vaadin-item id="vaadinItem1">
     Dakiti 
   </vaadin-item>
   <vaadin-item id="vaadinItem">
     Booker T 
   </vaadin-item>
  </vaadin-list-box>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

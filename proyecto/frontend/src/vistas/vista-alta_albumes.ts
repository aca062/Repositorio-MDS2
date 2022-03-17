import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

@customElement('vista-alta_albumes')
export class VistaAlta_albumes extends LitElement {
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
 <h2 id="h2" style="margin-left: 10%;">Dar de alta álbum</h2>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 100%; height: 20%;">
  <img id="img" style="margin-left: 10%;" src="https://qph.fs.quoracdn.net/main-qimg-830c6e9c07276481a5ce66dd3589bf5b-lq">
  <vaadin-button id="vaadinButton" style="align-self: center;">
   Añadir imagen
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="width: 100%;">
  <vaadin-text-field label="Titulo" id="titulo" style="margin-left: 10%; width: 60%;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout2" style="width: 100%;">
  <vaadin-text-field label="Nombre artista" id="nombreArtista" style="margin-left: 10%; width: 60%;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout3" style="width: 100%;">
  <vaadin-text-field label="Fecha edición" id="fechaEdición" style="margin-left: 10%; width: 60%;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout4" style="width: 100%;">
  <vaadin-select value="Item one" id="vaadinSelect" style="margin-left: 10%; width: 49%;">
   <template>
    <vaadin-list-box id="vaadinListBox" selected="0">
     <vaadin-item id="vaadinItem" selected>
       Item one 
     </vaadin-item>
     <vaadin-item id="vaadinItem1">
       Item two 
     </vaadin-item>
     <vaadin-item id="vaadinItem2">
       Item three 
     </vaadin-item>
    </vaadin-list-box>
   </template>
  </vaadin-select>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout5" style="width: 100%; justify-content: flex-end;">
  <vaadin-button id="vaadinButton1" style="margin-right: 5%;">
   Cancelar
  </vaadin-button>
  <vaadin-button id="vaadinButton2" style="margin-right: 5%;">
   Confirmar
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

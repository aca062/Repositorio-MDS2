import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-alta_canciones')
export class VistaAlta_canciones extends LitElement {
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
 <h2 id="h2" style="margin-left: 10%;">Dar de alta canción</h2>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="margin-left: 10%; width: 80%;">
  <vaadin-text-field label="Titulo" id="titulo"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="margin-left: 10%; width: 80%;">
  <vaadin-text-field label="Título álbum" id="títuloÁlbum"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout2" style="margin-left: 10%; width: 80%;">
  <vaadin-text-field label="Compositores" id="compositores"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout3" style="margin-left: 10%; width: 80%;">
  <vaadin-text-field label="Productores" id="productores"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout4" style="margin-left: 10%; width: 80%;">
  <vaadin-text-field label="Interpretes" id="interpretes"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout5" style="margin-left: 10%; width: 60%;">
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
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout6" style="align-self: flex-start; align-items: center; margin-left: 10%; width: 80%;">
  <h4 id="h4">Fichero multimedia</h4>
  <vaadin-button id="vaadinButton" style="margin-left: 1%;">
   Añadir
  </vaadin-button>
  <h5 id="h5" style="margin-left: 5%;">Solo son válidos los .mp3, .mp4, .ogg</h5>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout7" style="justify-content: flex-end; margin-left: 10%; width: 80%;">
  <vaadin-button id="vaadinButton1" style="flex-grow: 0; flex-shrink: 1; margin-right: 5%;">
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

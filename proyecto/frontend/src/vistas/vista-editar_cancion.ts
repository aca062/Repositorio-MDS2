import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

@customElement('vista-editar_cancion')
export class VistaEditar_cancion extends LitElement {
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
 <h2 id="h2" style="margin-left: 10%;">Editar cancion</h2>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 100%; margin-left: 10%;">
  <vaadin-text-field label="Título" id="título"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="width: 100%; margin-left: 10%;">
  <vaadin-text-field label="Título álbum"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout2" style="width: 100%; margin-left: 10%;">
  <vaadin-text-field label="Compositores"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout3" style="width: 100%; margin-left: 10%;">
  <vaadin-text-field label="Productores" id="productores"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout4" style="width: 100%; margin-left: 10%;">
  <vaadin-text-field label="Interpretes" id="interpretes"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout5" style="width: 100%; margin-left: 10%;">
  <vaadin-select value="Item one">
   <template>
    <vaadin-list-box>
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
 <vaadin-horizontal-layout style="width: 100%; align-self: flex-start; justify-content: flex-start; margin-left: 10%; align-items: center;" id="vaadinHorizontalLayout6">
  <h4 id="h4" style="align-self: center;">Fichero multimedia</h4>
  <vaadin-button id="vaadinButton" style="margin-left: 1%;">
   Añadir
  </vaadin-button>
  <h5 id="h5" style="flex-grow: 0; margin-left: 10%;">Solo son válidos los .mp3, .mp4, .ogg</h5>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout7" style="align-self: flex-end; justify-content: space-evenly; width: 25%; margin-right: 10%; margin-top: 1%;">
  <vaadin-button id="vaadinButton1">
   Cancelar
  </vaadin-button>
  <vaadin-button>
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

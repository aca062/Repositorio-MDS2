import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
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
 <h2 id="h2" style="margin-left: var(--lumo-space-xl);">Editar cancion</h2>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; margin-left: var(--lumo-space-xl);background-color: var(--lumo-contrast-10pct);">
  <vaadin-text-field label="Título" id="título" value="120"></vaadin-text-field>
  <vaadin-text-field label="Título álbum" value="El último tour del mundo"></vaadin-text-field>
  <vaadin-text-field label="Compositores" value="Tainy"></vaadin-text-field>
  <vaadin-text-field label="Productores" id="productores" value="Tainy"></vaadin-text-field>
  <vaadin-text-field label="Interpretes" id="interpretes" value="Bad bunny"></vaadin-text-field>
  <vaadin-select value="Regueton">
   <template>
    <vaadin-list-box>
     <vaadin-item>
      Regueton
     </vaadin-item>
     <vaadin-item>
       Item three 
     </vaadin-item>
    </vaadin-list-box>
   </template>
  </vaadin-select>
  <vaadin-horizontal-layout style="width: 100%; align-self: flex-start; justify-content: flex-start; align-items: center;" id="vaadinHorizontalLayout6">
   <h4 id="h4" style="align-self: center;">Fichero multimedia</h4>
   <vaadin-button id="vaadinButton" style="margin-left: 1%;">
     Añadir 
   </vaadin-button>
   <h5 id="h5" style="flex-grow: 0; margin-left: 10%;">Solo son válidos los .mp3, .mp4, .ogg</h5>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout7" style="align-self: flex-end; justify-content: space-evenly; width: 25%;">
   <vaadin-button id="vaadinButton1">
     Cancelar 
   </vaadin-button>
   <vaadin-button>
     Confirmar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

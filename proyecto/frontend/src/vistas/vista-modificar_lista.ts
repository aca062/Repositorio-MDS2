import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-modificar_lista')
export class VistaModificar_lista extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: flex-start;" id="layoutPrincipal">
 <h2 id="h2Titulo" style="margin-left: var(--lumo-space-xl); margin-top: var(--lumo-space-xl);">Editar lista de reproducción</h2>
 <vaadin-vertical-layout theme="spacing" id="layout" style="width: 50%; align-self: center; align-items: center; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);">
  <vaadin-text-field label="Nombre" placeholder="" id="textFieldNombre" style="margin-left: var(--lumo-space-xl); align-self: flex-start; width: 80%;" value="Vibes Up" has-value></vaadin-text-field>
  <vaadin-select value="Buscador de canciones" id="selectorCanciones" style="margin-left: var(--lumo-space-xl); width: 80%; align-self: flex-start;" label="Lista de canciones">
   <template>
    <vaadin-list-box id="desplegable" selected="0">
     <vaadin-item selected id="vaadinItem3">
       Buscador de canciones 
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
  <vaadin-horizontal-layout id="layoutListaCanciones" style="width: 85%; margin-left: var(--lumo-space-xl); flex-grow: 0; align-self: center;">
   <vaadin-list-box id="listaCanciones">
    <vaadin-item id="itemEliminarCancion1" style="flex-grow: 0; flex-shrink: 0;">
      Heading Up High 
     <vaadin-button id="botonEliminar1" style="flex-grow: 0; margin-left: var(--lumo-space-xl);">
       Eliminar 
     </vaadin-button>
    </vaadin-item>
    <vaadin-item id="itemEliminarCancion2">
      California 
     <vaadin-button style="flex-grow: 0; margin-left: var(--lumo-space-xl);" id="botonEliminar2">
       Eliminar 
     </vaadin-button>
    </vaadin-item>
    <vaadin-item id="itemEliminarCancion3">
      Leave a Light On 
     <vaadin-button style="flex-grow: 0; margin-left: var(--lumo-space-xl);" id="botonEliminar3">
       Eliminar 
     </vaadin-button>
    </vaadin-item>
   </vaadin-list-box>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" id="layoutBotones" style="width: 100%; justify-content: space-around;">
   <vaadin-button id="botonCancelar">
     Cancelar 
   </vaadin-button>
   <vaadin-button id="botonConfirmar" style="margin-right: 15%;">
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

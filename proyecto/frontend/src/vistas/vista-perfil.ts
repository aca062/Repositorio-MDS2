import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-perfil')
export class VistaPerfil extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; align-self: center; align-items: center; width: fit-content;">
    <img style="width: 200px; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l);" src="https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png">
    <vaadin-button>
     Editar
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 50%;">
    <h5 style="margin-top: 40px;">Heading 5</h5>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
     <h5>Heading 5</h5>
     <vaadin-button>
      Editar
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;">
    <h5>Seguidores</h5>
    <h5>1</h5>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;">
    <h5>Seguidos</h5>
    <h5>2</h5>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-button style="align-self: flex-end; margin: var(--lumo-space-m);">
   Recibir notificaciones
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: space-between;">
  <vaadin-button style="margin: var(--lumo-space-m);">
   Crear una nueva lista
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end;">
  <vaadin-button style="margin: var(--lumo-space-m);">
   Darse de baja
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

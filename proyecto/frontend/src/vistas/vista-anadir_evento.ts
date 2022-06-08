import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';

@customElement('vista-anadir_evento')
export class VistaAnadir_evento extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;" id="layoutPrincipal">
 <h2 id="h2Titulo" style="align-self: flex-start; padding-left: 50px">Añadir evento</h2>
 <vaadin-vertical-layout id="layoutEvento" style="width: 90%; height: 590px; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);">
  <vaadin-horizontal-layout theme="spacing" id="layoutEventoFoto" style="align-items: center; width: 50%;">
   <img id="img">
   <vaadin-upload id="upload"></vaadin-upload>
   <vaadin-button id="eliminarFoto" style="margin-left: var(--lumo-space-xl);">
    Eliminar foto
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-text-field label="Fecha" id="fecha" style="width: 70%;" value="14/04/2022" has-value></vaadin-text-field>
  <vaadin-text-field label="Hora" id="hora" style="width: 70%;" value="1.00" has-value></vaadin-text-field>
  <vaadin-text-field label="Lugar" id="lugar" style="width: 70%;" value="State farm arena" has-value></vaadin-text-field>
  <vaadin-horizontal-layout id="layoutBotones" style="justify-content: flex-end; width: 100%; align-self: flex-end;">
   <vaadin-button id="cancelar" style="margin-top: var(--lumo-space-xl); margin-right: var(--lumo-space-xl);">
     Cancelar 
   </vaadin-button>
   <vaadin-button id="confirmar" style="flex-grow: 0; flex-shrink: 1; margin-top: var(--lumo-space-xl);">
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
